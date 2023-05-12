package cards;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class DebitCard {
    private String amount;
    private String status;
}
