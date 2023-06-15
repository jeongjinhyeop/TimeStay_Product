package TimeStay.TimeStay_Product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductReviewVO {
    private int Pidx;
    private int Ridx;
    private int Rrating;
    private String Rtext;
    private String userid;


}
