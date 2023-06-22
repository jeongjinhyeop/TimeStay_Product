package TimeStay.TimeStay_Product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    private int Pidx;
    private int Ridx;
    private int Rscore;
    private String Rtext;
    private String userid;
    private String Rdelyn;
    private String Rwip;
    private String Rwdate;
    private String Rdelip;


}
