package specs

import spock.lang.Ignore
import geb.spock.GebReportingSpec
import java.text.SimpleDateFormat

@Ignore
class BaseGebSpec extends GebReportingSpec
{
    void setupSpec() {
    }

    def setup() {
    }

    String todaysDate() {

        Date date = Calendar.getInstance().getTime()

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy")

        return sdf.format(date)
    }
}