package model.dto;

public record TransferRequest(
        int fromAccountId,
        int toAccountId,
        double amount
) {
}