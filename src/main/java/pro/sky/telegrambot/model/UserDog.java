package pro.sky.telegrambot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Модель для работы с пользователями приюта собак
 */
@Entity(name = "users_for_dog")
public class UserDog {

    @Id
    private Long chatId;
    private String userName;
    private String mobileNumber;
    private String lastCommand;
    private boolean volunteerTrigger;

    public UserDog() {
    }

    public UserDog(Long chatId, String userName) {
        this.chatId = chatId;
        this.userName = userName;
        this.volunteerTrigger = false;
    }

    public String getLastCommand() {
        return lastCommand;
    }

    public void setLastCommand(String lastCommand) {
        this.lastCommand = lastCommand;
    }

    public boolean isVolunteerTrigger() {
        return volunteerTrigger;
    }

    public void setVolunteerTrigger(boolean volunteerTrigger) {
        this.volunteerTrigger = volunteerTrigger;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Long getChatId() {
        return chatId;
    }
    @Override
    public String toString() {
        return "Собачий приют" +
                "\nId=" + chatId +
                "\nuserName='" + userName +
                "\nmobileNumber='" + mobileNumber + '\'' +
                "\nВозможность отправки отчетов=" + volunteerTrigger;
    }
}
