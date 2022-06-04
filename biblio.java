package Biblioteka;

import LoginSite.Settings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Biblio extends Settings {
    @Test
    public void biblio() throws InterruptedException {
        String currentWindow = driver.getWindowHandle();
        Actions actions = new Actions(driver);

        driver.get("https://eom.dfsystems.ru/?auth=login\n");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        Assert.assertEquals("Библиотека электронных материалов – uchebnik.permkrai.ru", driver.getTitle());
        Thread.sleep(500);

        WebElement element4 = driver.findElement(By.id("lpLogin"));
        element4.sendKeys("borisova-178");
        Thread.sleep(1000);

        WebElement element5 = driver.findElement(By.id("lpPassword"));
        element5.sendKeys("password-178");
        Thread.sleep(1000);

        WebElement element51 = driver.findElement(By.id("lpEyeIcon"));
        element51.click();
        Thread.sleep(500);

        WebElement element6 = driver.findElement(By.id("lpSubmit"));
        element6.click();
        Thread.sleep(15000);
        Assert.assertEquals("Библиотека ЭПОС", driver.getTitle());

        WebElement element7 = driver.findElement(By.xpath("//*[text()='Алгебра']"));
        element7.click();
        Thread.sleep(1000);

        WebElement element8 = driver.findElement(By.xpath("//*[text()='7']"));
        element8.click();
        Thread.sleep(1000);

        WebElement element81 = driver.findElement(By.xpath("//*[text()='Базовый']"));
        element81.click();
        Thread.sleep(1000);

        WebElement element9 = driver.findElement(By.xpath("//*[text()='Тест']"));
        element9.click();
        Thread.sleep(4000);

        Assert.assertEquals("Библиотека ЭПОС — Тест", driver.getTitle());

        WebElement element911 = driver.findElement(By.cssSelector(".rectangleButton-345.buttonWithLeftIcon-364.orangeWithWhiteBorder-352"));
        element911.click();
        Thread.sleep(10000);
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(currentWindow)) {
                driver.switchTo().window(handle);
            }
        }

        Assert.assertEquals("Тест 2", driver.getTitle());

        WebElement element91 = driver.findElement(By.id("t_rp_997803"));
        element91.sendKeys("Любаева Ирина Игоревна");
        Thread.sleep(1000);

        WebElement element92 = driver.findElement(By.id("btnNext"));
        element92.click();
        Thread.sleep(1000);
        Assert.assertEquals("Тест 2", driver.getTitle());

        WebElement element93 = driver.findElement(By.xpath("//*[text()='Ответ 1']"));
        element93.click();
        Thread.sleep(1000);

        WebElement element94 = driver.findElement(By.id("btnNext"));
        element94.click();
        Thread.sleep(2000);
        Assert.assertEquals("Тест 2 - Результат онлайн теста", driver.getTitle());
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(3000);
        driver.switchTo().window(currentWindow);
        Assert.assertEquals("Библиотека ЭПОС — Тест", driver.getTitle());

        driver.navigate().back();
        Assert.assertEquals("Библиотека ЭПОС", driver.getTitle());

        WebElement element11 = driver.findElement(By.xpath("//*[text()='Сбросить']"));
        element11.click();
        Thread.sleep(3000);

        WebElement element12 = driver.findElement(By.xpath("//*[text()='еще 41']"));
        element12.click();
        Thread.sleep(1000);

        WebElement element131 = driver.findElement(By.xpath("//*[text()='География']"));
        element131.click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.xpath("//*[text()='11']"));
        element13.click();
        Thread.sleep(1000);
        WebElement element14 = driver.findElement(By.xpath("//*[text()='Глобальные проблемы современности']"));
        element14.click();
        Thread.sleep(5000);
        Assert.assertEquals("Библиотека ЭПОС — Насущные проблемы человечества. Глобальные проблемы современности", driver.getTitle());

        WebElement element15 = driver.findElement(By.xpath("//*[text()='Перейти']"));
        element15.click();
        Thread.sleep(3000);
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(currentWindow)) {
                driver.switchTo().window(handle);
            }
        }
        Assert.assertEquals("Мобильное электронное образование", driver.getTitle());

        driver.close();
        driver.switchTo().window(currentWindow);
        Assert.assertEquals("Библиотека ЭПОС — Насущные проблемы человечества. Глобальные проблемы современности", driver.getTitle());
        driver.navigate().back();
        Assert.assertEquals("Библиотека ЭПОС", driver.getTitle());

        WebElement element151 = driver.findElement(By.xpath("//*[text()='Сбросить']"));
        element151.click();
        Thread.sleep(3000);

        WebElement element16 = driver.findElement(By.xpath("//*[text()='Мои материалы']"));
        element16.click();
        Thread.sleep(1000);

        WebElement element17 = driver.findElement(By.xpath("//*[text()='Новая']"));
        element17.click();
        Thread.sleep(1000);

        WebElement element191 = driver.findElement(By.xpath("//*[text()='Мои материалы']"));
        element191.click();
        Thread.sleep(1000);

        WebElement element18 = driver.findElement(By.xpath("//*[text()='Новая папка']"));
        Action action=actions.contextClick(element18).build();
        action.perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.doubleClick();
        actions.doubleClick();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys("алгебра 5 класс").build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(2000);

        WebElement element192 = driver.findElement(By.xpath("//*[text()='Мои материалы']"));
        element192.click();
        Thread.sleep(2000);
        //driver.navigate().refresh();

        WebElement element19 = driver.findElement(By.xpath("//div[contains(@title,'алгебра 5 класс')]"));
        element19.click();
        Thread.sleep(1000);

        WebElement element181 = driver.findElement(By.xpath("//button[text()='Мои материалы']"));
        element181.click();
        Thread.sleep(1000);

        WebElement element20 = driver.findElement(By.id("-checkbox"));
        element20.click();
        Thread.sleep(1000);

        WebElement element21 = driver.findElement(By.xpath("//*[text()='Удалить']"));
        element21.click();
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(3000);
    }
}
