import java.util.Calendar;
import java.util.Scanner;

public class Main {
    /**
     * Tính tổng số táo khách hàng mua và được khuyến mãi
     *
     * @param customer: loại khách hàng: 0:khách hàng mới, 1: khách hàng cũ
     * @param apples:   số lượng táo khách hàng mua
     * @return tổng số táo khách hàng nhận được
     */
    public static int number_of_apples(int customer, int apples) {
        int promote = 0;
        // đầu vào không hợp lệ
        if ((customer != 0 && customer != 1) || apples > 10 || apples <= 0)
            return -1;
        // khi khách hàng là khách đã từng mua
        else if (customer == 1) {
            promote = apples / 5;
        }
        // khi khách hàng là khách hàng mới
        else if (customer == 0) {
            if (apples < 5 || (apples % 2 == 0 && apples % 5 != 0))
                promote = apples / 2;
            else {
                if (apples % 5 == 0) promote = apples / 5 * 3;
                promote = apples / 5 * 3 + (apples % 5) / 2;
            }
        }
        return promote + apples;
    }
}
