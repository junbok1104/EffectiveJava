import org.Item1.Company;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Item1Test {
    @Test
    void test1() {
        Company early = Company.getInstance("org.Item1.Early"); // 실제 경로
        assertThat(early.getCompanyName()).isEqualTo("Early"); // true

//        Company kakao = Company.getInstance("item1s.kakao"); // 존재하지 않는 path
//        assertThat(kakao.getCompanyName()).isEqualTo("KAKAO"); // 에러
    }
}
