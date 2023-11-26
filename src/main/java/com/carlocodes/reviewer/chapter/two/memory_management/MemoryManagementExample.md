# Memory Management Example

1. Stack:
- The stack is used for the execution of thread-specific operations, such as method calls and
  local variable storage.
- It stores primitive data types and references to objects.
- Each thread has its own stack, and method calls create stack frames containing local
  variables and control flow data.

2. Heap:
- The heap is the region of memory where objects and their instance variables are stored.
- Objects created with the `'new'` keyword, such as instances of classes, arrays, etc., are
  allocated on the heap.
- The heap is shared among all threads.

3. Reference Types:
- In Java, variables of reference types (e.g., objects, arrays) hold references to objects.
  These references are stored on the stack.
- The actual objects are allocated on the heap.

4. Local Variables and Objects:
- Local variables, including those holding references, are stored on the stack.
- Objects themselves, i.e., the data they encapsulate, are allocated on the heap.

5. Method Execution:
- When a method is called, a new stack frame is created on the stack.
- Local variables, including references, are part of this stack frame.
- When the method completes, the stack frame is popped off the stack, and local variables
  (including references) go out of scope.

6. Garbage Collection:
- The garbage collector identifies and reclaims memory occupied by objects that are no longer
  reachable.
- It doesn't collect stack-allocated variables; it collects objects on the heap that are no
  longer reachable from the root of the object graph.

Code Example:
```
public ClipDto postClip(ClipDto clipDto) throws ClippedException {
    try {
        long userId = clipDto.getUser().getId();
        int gameId = clipDto.getGame().getId();
        String clipUrl = clipDto.getClipUrl();
        User user = userService.findById(userId)
            .orElseThrow(() -> new ClippedException(String.format("User with id: %d does not exist!", userId)));
        Game game = gameService.findById(gameId)
            .orElseThrow(() -> new ClippedException(String.format("Game with id: %d does not exist!", gameId)));
        if (Objects.isNull(clipUrl) || clipUrl.isBlank())
            throw new ClippedException("Clip url should not be null/empty/blank!");
        Set<Game> watchedGames = user.getGames();
        if (!watchedGames.contains(game))
            throw new ClippedException(String.format("User with id: %d cannot post a clip to a game they are not watching!", userId));
        return ClipMapper.INSTANCE.mapToDto(saveClip(clipDto, user, game));
    } catch (ClippedException e) {
        throw new ClippedException(String.format("Post clip for user with id: %d to game with id: %d failed due to %s",
            clipDto.getUser().getId(), clipDto.getGame().getId(), e.getMessage()), e);
    }
}
```

7. watchedGames example:
- In your `'postClip'` method, the `'watchedGames'` variable is a local variable, and its
  reference is stored on the stack.
- The actual `'Set<Game>'` object (the data) is allocated on the heap.
- When the method completes, the stack frame is popped off the stack, and the reference to the
  `'watchedGames'` object is no longer in scope.
- The `'watchedGames'` object on the heap becomes unreachable and is eligible for garbage
  collection.

In summary, the `'watchedGames'` reference is stored on the stack, and the actual `'Set<Game>'`
object is on the heap. When the method exits, the reference on the stack goes out of scope,
making the `'watchedGames'` object on the heap eligible for garbage collection. The Java
Virtual Machine's garbage collector will automatically reclaim the memory occupied by the
unreachable object on the heap.
