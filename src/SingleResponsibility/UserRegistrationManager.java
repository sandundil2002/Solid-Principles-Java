package SingleResponsibility;

public class UserRegistrationManager {
    private final LogService logService;
    private final MailService mailService;
    private final UserDataService userDataService;

    public UserRegistrationManager(LogService logService, MailService mailService, UserDataService userDataService) {
        this.logService = logService;
        this.mailService = mailService;
        this.userDataService = userDataService;
    }

    public void registerUser(String username, String password){
        userDataService.saveUserData(username,password);
        mailService.sendMail(username);
        logService.logUser(username);
    }
}