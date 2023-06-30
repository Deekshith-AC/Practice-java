class Inheritance {
    static class E {
        int empID;
        String name;
        double salary;

        E(int empID, String name, double salary) {
            this.empID = empID;
            this.name = name;
            this.salary = salary;
        }

        double getSalary() {
            return salary;
        }

        void setSalary(double salary) {
            this.salary = salary;
        }

        int getEmpID() {
            return empID;
        }

        void setEmpID(int empID) {
            this.empID = empID;
        }

        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

    }

    static class PE extends E {
        int expe;
        double bp, vp;
        double hrap;

        PE(int expe, double bp, double hrap) {
            super(0, "", 0.0);
            this.expe = expe;
            this.bp = bp;
            this.hrap = hrap;
        }

        double getBP() {
            return bp;
        }

        void setBP(double bp) {
            this.bp = bp;
        }

        double getHrap() {
            return hrap;
        }

        void setHrap(double hrap) {
            this.hrap = hrap;
        }

        int getExpe() {
            return expe;
        }

        void setExpe(int expe) {
            this.expe = expe;
        }

        double vpcal() {
            if (expe < 3) {
                vp = 0.00;
            } else if (expe >= 3 && expe < 5) {
                vp = 0.05;
            } else if (expe >= 5 && expe > 10) {
                vp = 0.07;
            } else {
                vp = 0.12;
            }
            return vp;
        }

        void calsal() {
            double z = this.bp * vpcal();
            this.salary = z + bp + hrap;
            System.out.println("Permant Employee : Your Salary : " + salary);
        }
    }

    static class CE extends E {
        double wages;
        int hours;

        CE(double wages, int hours) {
            super(0, "", 0.0);
            this.wages = wages;
            this.hours = hours;
        }

        double getWages() {
            return wages;
        }

        int getHours() {
            return hours;
        }

        void setHours(int hours) {
            this.hours = hours;
        }

        void setWages(double wages) {
            this.wages = wages;
        }

        void calsal() {
            this.salary = wages * hours;
            System.out.println("Contract Employee : Your Salary : " + salary);
        }
    }

    public static void main(String[] args) {
        PE pe = new PE(3, 10000, 1500);
        pe.setEmpID(101);
        pe.calsal();

        CE ce = new CE(500, 10);
        ce.setName("Ankit");
        ce.setEmpID(102);
        ce.calsal();
    }
}
