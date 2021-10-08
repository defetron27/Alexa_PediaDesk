package com.max;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.max.Handlers.*;

public class SkillRequestHandler extends SkillStreamHandler
{
    public SkillRequestHandler()
    {
        super(getSkills());
    }

    private static Skill getSkills()
    {
        return Skills.standard().addRequestHandlers(
                new LaunchRequestHandler(),
                new GetMeaningNameIntentHandler(),
                new HelpIntentHandler(),
                new CancelAndStopIntentHandler(),
                new YesIntentHandler(),
                new NoIntentHandler(),
                new FallbackIntentHandler(),
                new SessionEndedRequestHandler()
                ).withSkillId("amzn1.ask.skill.dd0c3fc4-9025-43c6-a681-ee3c7ce81182").build();
    }
}
