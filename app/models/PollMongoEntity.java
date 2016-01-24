
package models;

import java.util.ArrayList;
import java.util.List;
import com.avaje.ebean.Model;

public class PollMongoEntity extends Model {
    public String pollName;
    public String pollDescription;
    public String creator;
    public List<String> optionsName = new ArrayList<String>();
    public List<PollMongoResultEntity> results = new ArrayList<PollMongoResultEntity>();
}
