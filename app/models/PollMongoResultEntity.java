
package models;

import java.util.ArrayList;
import java.util.List;
import com.avaje.ebean.Model;

public class PollMongoResultEntity extends Model {
    public String participantName;
    public String email;
    public List<Boolean> optionValues = new ArrayList<Boolean>();
}
