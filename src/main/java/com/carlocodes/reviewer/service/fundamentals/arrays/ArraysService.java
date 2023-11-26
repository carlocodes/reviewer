package com.carlocodes.reviewer.service.fundamentals.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysService {
    public static class Transaction {
        private int transactionId;
        List<Installment> installments;
        public void setTransactionId(int transactionId) {
            this.transactionId = transactionId;
        }
        public int getTransactionId() {
            return transactionId;
        }
        public void setInstallments(List<Installment> installments) {
            this.installments = installments;
        }
        public List<Installment> getInstallments() {
            return installments;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "transactionId=" + transactionId +
                    ", installments=" + installments +
                    '}';
        }
    }

    public static class Installment {
        private int installmentId;
        public void setInstallmentId(int installmentId) {
            this.installmentId = installmentId;
        }
        public int getInstallmentId() {
            return installmentId;
        }

        @Override
        public String toString() {
            return "Installment{" +
                    "installmentId=" + installmentId +
                    '}';
        }
    }

    public static class SampleDto {
        List<Transaction> transactions;
        public void setTransactions(List<Transaction> transactions) {
            this.transactions = transactions;
        }
        public List<Transaction> getTransactions() {
            return transactions;
        }

        @Override
        public String toString() {
            return "SampleDto{" +
                    "transactions=" + transactions +
                    '}';
        }
    }

    public void myMethod() {
        int[] installmentIds = {3, 2, 1};
        Arrays.sort(installmentIds);
        System.out.println(Arrays.toString(installmentIds));

        List<Installment> installments = new ArrayList<>();

        for (int id : installmentIds) {
            Installment installment = new Installment();
            installment.setInstallmentId(id);
            installments.add(installment);
        }

        List<Installment> newInstallments = Arrays.stream(installmentIds).mapToObj(id -> {
            Installment installment = new Installment();
            installment.setInstallmentId(id);
            return installment;
        }).collect(Collectors.toList());
        System.out.println("New Installments: " + newInstallments);

        Transaction t1 = new Transaction();
        t1.setTransactionId(1);
        t1.setInstallments(installments);

        SampleDto sampleDto = new SampleDto();
        sampleDto.setTransactions(List.of(t1));

        System.out.println("Sample DTO: " + sampleDto);
    }

    public static void main(String[] args) {
        ArraysService arraysService = new ArraysService();
        arraysService.myMethod();
    }
}
