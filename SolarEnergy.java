import java.util.Scanner;

public class SolarEnergy {

    // 2c) Method to calculate total energy
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // 2a) Data Types: Store and display details
        // ==========================================
        int panelId = 101;                   // Panel ID - integer
        double energyGeneratedKwh = 14.5;    // Energy generated - decimal value
        int numberOfPanels = 8;              // Number of solar panels - integer
        char systemStatus = 'A';             // System status - character ('A' for Active)

        System.out.println("=== Solar System Details (2a) ===");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGeneratedKwh + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
        System.out.println();

        // ==========================================
        // 2b) If-Else Condition: Energy monitoring
        // ==========================================
        System.out.println("=== Energy Status Check (2b) ===");
        System.out.print("Enter energy generated (in kWh): ");
        double currentEnergy = scanner.nextDouble();

        if (currentEnergy >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
        System.out.println();

        // ==========================================
        // 2c) Methods: Calculate total energy
        // ==========================================
        System.out.println("=== Total Energy Calculation (2c) ===");
        System.out.print("Enter morning energy generation (in kWh): ");
        double morning = scanner.nextDouble();

        System.out.print("Enter evening energy generation (in kWh): ");
        double evening = scanner.nextDouble();

        double totalEnergy = calculateTotalEnergy(morning, evening);
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        scanner.close();
    }
}