package re.validationb3.DTO;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import re.validationb3.Annotation.MultipleOfTenThousand;

public class WithdrawDto {

    @NotNull(message = "Số tiền không được để trống")
    @Positive(message = "Số tiền phải > 0")
    @MultipleOfTenThousand
    private Long withdrawAmount;

    public Long getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(Long withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
