package com.nimbus.test;

import com.antheminc.oss.nimbus.domain.defn.Domain;
import com.antheminc.oss.nimbus.domain.defn.Execution;
import com.antheminc.oss.nimbus.domain.defn.Execution.Config;
import com.antheminc.oss.nimbus.domain.defn.Repo;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

public class Example
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}


class Configuration{

    @Execution.Config(url="/pageAddEditGoal/tileEditGoal/sectionEditGoal/goalDetailsForm/_nav?pageId=pageCarePlanSummary")
    @ViewConfig.Button(type = ViewConfig.Button.Type.button)
    private String cancel;


}
@Domain(value = "cmcaseview",includeListeners={Domain.ListenerType.websocket})
//@MapsTo.Type(CMCase.class)
@Repo(value= Repo.Database.rep_none, cache= Repo.Cache.rep_device)
@Getter
@Setter
class VRCmCase {

}
