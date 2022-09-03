import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void shouldGetAllFilms() {
        CashbackHackService service = new CashbackHackService();

int expected = 800;
int actual = service.remain(200);
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void shouldGetAllFilmsa() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void shouldGetAllFilmsaa() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);

    }

}
