package wamis.tool.box;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import btw.wamis.toolbox.WamisToolBox;

public class ExamplePreLaunchInitializer implements PreLaunchEntrypoint {
    /**
     * Runs the PreLaunch entrypoint to register BTW-Addon.
     * Don't initialize anything else here, use
     * the method Initialize() in the Addon.
     */
    @Override
    public void onPreLaunch() {
        WamisToolBox.getInstance();
    }
}
