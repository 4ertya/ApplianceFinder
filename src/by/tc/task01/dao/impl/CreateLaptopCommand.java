package by.tc.task01.dao.impl;

import by.tc.task01.dao.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

import java.util.Map;

public class CreateLaptopCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> params) {
        Laptop laptop=new Laptop.Builder()
                .batteryCapacity(Integer.parseInt(params.get("BATTERY_CAPACITY")))
                .cPU(Double.parseDouble(params.get("CPU")))
                .displayInches(Integer.parseInt(params.get("DISPLAY_INCHES")))
                .memoryRom(Integer.parseInt(params.get("MEMORY_ROM")))
                .oS(params.get("OS"))
                .systemMemory(Integer.parseInt(params.get("SYSTEM_MEMORY")))
                .build();
        return laptop;
    }
}
