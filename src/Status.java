public class Status {

    static class AcceptanceStatus {
        private static int status;

        static int getStatus() {
            return status;
        }

        public static String currentState() {

            if (status == 0) {
                return "Reject preference";
            }
            return "Accept preference";
        }

        static void setStatus(int status) {
            AcceptanceStatus.status = status;
        }
    }

}
