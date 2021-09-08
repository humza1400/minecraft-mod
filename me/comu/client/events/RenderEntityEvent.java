package me.comu.client.events;

import me.comu.api.event.Event;

public class RenderEntityEvent extends Event
{
    private final Time time;

    public RenderEntityEvent(Time time)
    {
        this.time = time;
    }

    public Time getTime()
    {
        return time;
    }

    public enum Time
    {
        BEFORE, AFTER
    }
}
