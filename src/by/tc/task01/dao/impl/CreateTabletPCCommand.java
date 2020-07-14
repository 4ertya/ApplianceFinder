package by.tc.task01.dao.impl;

import by.tc.task01.dao.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

import java.util.Map;

public class CreateTabletPCCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> params) {
        TabletPC tabletPC = new TabletPC.Builder()
                .batteryCapacity(Integer.parseInt(params.get("BATTERY_CAPACITY")))
                .color(params.get("COLOR"))
                .displayInches(Integer.parseInt(params.get("DISPLAY_INCHES")))
                .flashMemoryCapacity(Integer.parseInt(params.get("FLASH_MEMORY_CAPACITY")))
                .memoryRom(Integer.parseInt(params.get("MEMORY_ROM")))
                .build();

        return tabletPC;
    }
}
