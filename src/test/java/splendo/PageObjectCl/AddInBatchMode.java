package splendo.PageObjectCl;

import org.openqa.selenium.By;

import org.openqa.selenium.By;

import static splendo.PageObjectCl.BaseTest.TextView;
import static splendo.PageObjectCl.BaseTest.app_package_name;

public class AddInBatchMode {

    public By moreOptions = By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
    public By addInBatchMode = By.xpath(TextView + "[@text='Add in Batch Mode']");
    public By whatIsToBeDone = By.id(app_package_name + "edtTaskName");
}