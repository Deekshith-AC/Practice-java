package Java_fundamentals;
public class Ploymorphism2 {
    public static class Registration {
        String customerName, passportNo, pancardNo;
        int voterId, licensenNo;
        long[] telephoneNo = new long[2];

        Registration(String customerName, String passportNo, long[] telephoneNo) {
            this.customerName = customerName;
            this.passportNo = passportNo;
            this.telephoneNo = telephoneNo;
        }

        Registration(String customerName, int licensenNo, String pancardNo, long[] telephoneNo) {
            this.customerName = customerName;
            this.licensenNo = licensenNo;
            this.pancardNo = pancardNo;
            this.telephoneNo = telephoneNo;
        }

        Registration(String customerName, int voterId, int licensenNo, long[] telephoneNo) {
            this.customerName = customerName;
            this.voterId = voterId;
            this.licensenNo = licensenNo;
            this.telephoneNo = telephoneNo;
        }

        Registration(String customerName, String pancardNo, int voterId, long[] telephoneNo) {
            this.customerName = customerName;
            this.pancardNo = pancardNo;
            this.voterId = voterId;
            this.telephoneNo = telephoneNo;
        }

        String getCustomerName() {
            return customerName;
        }

        public String getPancardNo() {
            return pancardNo;
        }

        public int getVoterId() {
            return voterId;
        }

        public String getPassportNo() {
            return passportNo;
        }

        public int getLicensenNo() {
            return licensenNo;
        }

        public long[] getTelephoneNo() {
            return telephoneNo;
        }

        void display() {
            System.out.println("Congratulations" + getCustomerName()
                    + "!!! you have been successfully registered for our services with the following details:");
            if (getPassportNo() != null) {
                System.out.println("Passport number:" + getPassportNo());

            } else if (getLicensenNo() != 0 && getPancardNo() != null) {
                System.out.println("Pan card number:" + getPancardNo());
                System.out.println("License number:" + getLicensenNo());

            } else if (getLicensenNo() != 0 && getVoterId() != 0) {
                System.out.println("Voter id:" + getVoterId());
                System.out.println("License number:" + getLicensenNo());
            } else {
                System.out.println("Voter id:" + getVoterId());
                System.out.println("Pan card number:" + getPancardNo());
            }
            System.out.println("Phone numbers:");
            for (long i : getTelephoneNo()) {
                System.out.println(i);
            }
        }
    }

    static class tester {
        public static void main(String[] args) {

            Registration re1 = new Registration("Kevin", "MN9891N", new long[] { 9452425421L, 7676765252L });
            re1.display();
            Registration re2 = new Registration("Julias", 123, "PN7878", new long[] { 2345615451L, 6763562562L });
            re2.display();
            Registration re3 = new Registration("Jammy", 765, 45453, new long[] { 2345615451L, 6763562562L });
            re3.display();
            Registration re4 = new Registration("Rose", "PN8934", 34356, new long[] { 9867456367L, 7645367356L });
            re4.display();
        }
    }
}
