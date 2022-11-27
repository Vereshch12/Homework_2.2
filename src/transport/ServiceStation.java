package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <T extends Transport>{

    private String name;
    private Queue<T> queue = new LinkedList<>();

    public ServiceStation(String name) {
        this.name = name;
    }

    public void addTransportInQueue(T transport){
        if (transport.getClass() == Bus.class){
            throw new RuntimeException("\nАвтобусы не нуждаются в тех обслуживании!");
        }else {
            queue.offer(transport);
            System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " встал в очередь на Сервисной станции " + name);
        }
    }

    public void carryOutMaintenanceInServiceStation() throws SpecializationException {
        T transport = queue.poll();
        if (transport != null){
            if (transport.getMechanics().isEmpty()){
                System.out.println("\nУ автомобиля " + transport.getBrand() + " " + transport.getModel() + " нет команды механиков! Невозможно провести техобслуживание!");
                carryOutMaintenanceInServiceStation();
            }
            else {
                transport.getMechanics().iterator().next();
                System.out.println(". Сервисная станция: " + name);
                carryOutMaintenanceInServiceStation();
            }
        }
    }

}
