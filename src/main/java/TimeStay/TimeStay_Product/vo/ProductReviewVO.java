package TimeStay.TimeStay_Product.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductReviewVO {
    private int pidx;
    private int ridx;
    private int rscore;
    private String rtext;
    private String userid;
    private String rdelyn;
    private String rwip;
    private String rwdate;
    private String rdelip;
}

