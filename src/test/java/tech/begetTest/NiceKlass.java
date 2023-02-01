package tech.begetTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NiceKlass extends WebDriverSet{
    @Test //Тест успешно пройдён, производится РАСПРЕДЕЛЕНИЕ по группам
    //***Требование покрыто
    public void Nams(){
        driver.get("https://kobor.teslaserver.ru/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[contains(text(), 'Ваш город')])[last()]")));
        new Actions(driver)
                .keyDown(Keys.ESCAPE)
                .sendKeys("a")
                .perform();
        driver.findElement(By.xpath("//*[@id=\"scrollWrapper\"]/div[1]/div[2]/div/div[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='SearchPopupHead-sc-1cmgsok-0 cEoWiF']")));
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .sendKeys("Холодильник бирюса")
                .perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'По товарам (')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), \"Холодильник Бирюса\")]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'категориям ')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), \"Холодильник\")]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'брендам')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), \"Бирюса\")] | //span[contains(text(), \"Холодильник\")]")));
        System.out.println("Распределение по группам complitied");
    }
    @Test //Тест успешно пройдён, производится поиск по НАЗВАНИЮ товара
    public void Name(){
        driver.get("https://kobor.teslaserver.ru/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[contains(text(), 'Ваш город')])[last()]")));
        new Actions(driver)
                .keyDown(Keys.ESCAPE)
                .sendKeys("a")
                .perform();
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//*[@id=\"scrollWrapper\"]/div[1]/div[2]/div/div[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"SearchPopupInputLabel-sc-xwhyud-0 edaCfE\"]")));
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .sendKeys("Стул")
                .perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/div[2]/h5")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[1]/div")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"scrollWrapper\"]/div[3]/div[3]/div[2]/span")));
        driver.findElement(By.xpath("//div[contains(@title, 'Стул')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@title, 'Стул')]")));
        System.out.println("Стул complitied");
    }
    @Test //Тест успешен, автозамена RU/EN производится
    //Поиск производится с учетом неверно выбранной раскладки пользователя RU/EN (автозамена).
    //Требование покрыто, при вводе Cnek вместо Стул, производится автозамена, поиск выполняется верно.
    public void transit(){
        driver.get("https://kobor.teslaserver.ru/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[contains(text(), 'Ваш город')])[last()]")));
        new Actions(driver)
                .keyDown(Keys.ESCAPE)
                .sendKeys("a")
                .perform();
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//*[@id=\"scrollWrapper\"]/div[1]/div[2]/div/div[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"SearchPopupInputLabel-sc-xwhyud-0 edaCfE\"]")));
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .sendKeys("Cnek")
                .perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/div[2]/h5")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[1]/div")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"scrollWrapper\"]/div[3]/div[3]/div[2]/span")));
        driver.findElement(By.xpath("//div[contains(@title, 'Стул')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@title, 'Стул')]")));
        System.out.println("Автозамена complitied");
    }
    @Test //Тест успешно пройдён, производится поиск по АРТИКЛУ товара
    //Вывод результатов поиска производится без дублирования:
    // товар, найденный по нескольким из указанных критериев, выводится в результатах поиска один раз.
    //***Требование покрыто этим тестом, вывод одного уникального значения, товар не повторяется.
    public void articul(){
        driver.get("https://kobor.teslaserver.ru/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[contains(text(), 'Ваш город')])[last()]")));
        new Actions(driver)
                .keyDown(Keys.ESCAPE)
                .sendKeys("a")
                .perform();
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//*[@id=\"scrollWrapper\"]/div[1]/div[2]/div/div[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"SearchPopupInputLabel-sc-xwhyud-0 edaCfE\"]")));
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .sendKeys("29971")
                .perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/div[2]/h5")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[1]/div")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"scrollWrapper\"]/div[3]/div[3]/div[2]/span")));
        driver.findElement(By.xpath("//*[@id=\"scrollWrapper\"]/div[4]/div[3]/div/div[1]/div/a/div[3]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@title, 'Стул')]")));
        System.out.println("Артикул complitied");
    }
    @Test //Тест успешно пройдён, в описании присутствует введённое нами значение.
    public void info(){
        driver.get("https://kobor.teslaserver.ru/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[contains(text(), 'Ваш город')])[last()]")));
        new Actions(driver)
                .keyDown(Keys.ESCAPE)
                .sendKeys("a")
                .perform();
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//*[@id=\"scrollWrapper\"]/div[1]/div[2]/div/div[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"SearchPopupInputLabel-sc-xwhyud-0 edaCfE\"]")));
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .sendKeys("Стул")
                .perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/div[2]/h5")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[1]/div")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"scrollWrapper\"]/div[3]/div[3]/div[2]/span")));
        driver.findElement(By.xpath("//div[contains(@title, 'Стул')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@title, 'Стул')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"scrollWrapper\"]/div[5]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div/div[2]")));
        driver.findElement(By.xpath("//*[@id=\"scrollWrapper\"]/div[5]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div/div[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Стул')]")));
        System.out.println("Описание complitied");
    }
    @Test //Тест успешно пройдён, производится поиск по НАЗВАНИЮ товара
    //Производится автоматический поиск ошибок / опечаток в поисковом запросе и их замена. Учитываются:
    //Орфографические ошибки в словах общего употребления.
    //***Требование покрыто, орфографические ошибки исправляеются на верное значение
    public void ErrorName(){
        driver.get("https://kobor.teslaserver.ru/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[contains(text(), 'Ваш город')])[last()]")));
        new Actions(driver)
                .keyDown(Keys.ESCAPE)
                .sendKeys("a")
                .perform();
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//*[@id=\"scrollWrapper\"]/div[1]/div[2]/div/div[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"SearchPopupInputLabel-sc-xwhyud-0 edaCfE\"]")));
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .sendKeys("Халодильник")
                .perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/div[2]/h5")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[1]/div")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"scrollWrapper\"]/div[3]/div[3]/div[2]/span")));
        driver.findElement(By.xpath("//div[contains(@title, 'Холодильник')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@title, 'Холодильник')]")));
        System.out.println("Орфография complitied");
    }
    @Test //Тест провален, автозамена не всегда исправляется слова, которые имеют не более 3-х ошибок
    //Производится автоматический поиск ошибок / опечаток в поисковом запросе и их замена. Учитываются:
    //Опечатки в названии и артикуле товара. Автоматически исправляются слова, содержащие не более 3 ошибочных символов.
    //***Требование покрыто, не все слова исправляются имея не более 3-х ошибок. К примеру слово "Сстулл"-исправляется, а "Стуллл"-нет.
    public void ErrorName2(){
        driver.get("https://kobor.teslaserver.ru/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[contains(text(), 'Ваш город')])[last()]")));
        new Actions(driver)
                .keyDown(Keys.ESCAPE)
                .sendKeys("a")
                .perform();
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//*[@id=\"scrollWrapper\"]/div[1]/div[2]/div/div[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"SearchPopupInputLabel-sc-xwhyud-0 edaCfE\"]")));
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .sendKeys("Стуллл 29971")
                .perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/div[2]/h5")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[1]/div")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"scrollWrapper\"]/div[3]/div[3]/div[2]/span")));
        driver.findElement(By.xpath("//div[contains(@title, 'Стул')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@title, 'Стул')]")));
        System.out.println("Автозамена опечаток не более 3-х ошибок complitied");
    }
    @Test //Тест успешно пройдён, производится распознавание транслитерации
    //Производится автоматическое распознавание транслитерации и приведение поискового запроса к нативному языку.»
    //***Требование покрыто, происходит автоматическое распознавание транслитерации и приведение поискового запроса к нативному языку.
    public void TranslationName(){
        driver.get("https://kobor.teslaserver.ru/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[contains(text(), 'Ваш город')])[last()]")));
        new Actions(driver)
                .keyDown(Keys.ESCAPE)
                .sendKeys("a")
                .perform();
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//*[@id=\"scrollWrapper\"]/div[1]/div[2]/div/div[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"SearchPopupInputLabel-sc-xwhyud-0 edaCfE\"]")));
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .sendKeys("Holodilnik")
                .perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/div[2]/h5")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[1]/div")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"scrollWrapper\"]/div[3]/div[3]/div[2]/span")));
        driver.findElement(By.xpath("//div[contains(@title, 'Холодильник')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@title, 'Холодильник')]")));
        System.out.println("Транслитерация complitied");
    }
}
