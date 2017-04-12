import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emrecan on 12.04.2017.
 */
@ManagedBean
@RequestScoped
public class User {

    String fullname;
    String address;
    String city;
    String gotDriverLisence;
    List<String> gender = new ArrayList<>();

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGotDriverLisence() {
        return gotDriverLisence;
    }

    public void setGotDriverLisence(String gotDriverLisence) {
        this.gotDriverLisence = gotDriverLisence;
    }

    public List<String> getGender() {
        return gender;
    }

    public void setGender(List<String> gender) {
        this.gender = gender;
    }
}
