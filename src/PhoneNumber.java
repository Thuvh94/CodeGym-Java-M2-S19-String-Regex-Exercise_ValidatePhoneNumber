import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    //    Viết phương thức để kiểm tra tính hợp lệ của số điên thoại.
//    Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
//    x là ký tự số
//    Không chứa các ký tự đặc biệt
    public final String PHONE_REGEX = "^\\([\\d]{2}\\)\\-\\([0][\\d]{9}\\)$";

    public PhoneNumber() {
    }

    public boolean validate(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean isValid = matcher.matches();
        return isValid;
    }
}

