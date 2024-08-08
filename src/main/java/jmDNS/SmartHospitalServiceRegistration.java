package jmDNS;

import java.io.IOException;
import java.net.InetAddress;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class SmartHospitalServiceRegistration {

    public static void main(String[] args) throws InterruptedException {

        try {
        	// Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register Patient Monitoring Service
            ServiceInfo monitoringServiceInfo = ServiceInfo.create(
                    "_patientmonitoring._tcp.local.", "Patient Monitoring Service", 50051, "path=/monitor");
            jmdns.registerService(monitoringServiceInfo);

            // Register Room Environment Control Service
            ServiceInfo environmentServiceInfo = ServiceInfo.create(
                    "_roomenvironment._tcp.local.", "Room Environment Control Service", 50052, "path=/control");
            jmdns.registerService(environmentServiceInfo);

            // Register Medication Dispensing Service
            ServiceInfo dispensingServiceInfo = ServiceInfo.create(
                    "_medicationdispensing._tcp.local.", "Medication Dispensing Service", 50053, "path=/dispense");
            jmdns.registerService(dispensingServiceInfo);

            System.out.println("Services are registered. Press enter to exit.");
            System.in.read();

            // Unregister all services
            jmdns.unregisterAllServices();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
