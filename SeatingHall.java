public class SeatingHall {
    int[][] arr;
    int rows;
    int cols;
    public SeatingHall(int r, int c){
        rows = r;
        cols = c;
        arr = new int[r][c];

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = 0;
            }
        }
    }

    public void bookSeat(int r, int c){
        if(r<=0 || r>rows || c<=0 || c>cols){
            System.out.println("Booking failed");
            return;
        }

        r--;
        c--;

        arr[r][c] = 1;
    }

    public void display(){
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public boolean isBooked(int r, int c){
        if(r<=0 || r>rows || c<=0 || c>cols){
            System.out.println("Booking failed");
            return false;
        }

        r--;
        c--;

        return arr[r][c] == 1;
    }

    public static void main(String[] args) {
        SeatingHall hall = new SeatingHall(5, 5);

        System.out.println("Initial Seating Arrangement:");
        hall.display();

        System.out.println("\nBooking seats at (2, 3), (1, 1), and (5, 5):");
        hall.bookSeat(2, 3);
        hall.bookSeat(1, 1);
        hall.bookSeat(5, 5);
        hall.display();

        System.out.println("\nAttempting to book invalid seat at (6, 7):");
        hall.bookSeat(6, 7);

        System.out.println("\nCheck if seats are booked:");
        System.out.println("Seat (2, 3): " + hall.isBooked(2, 3));
        System.out.println("Seat (3, 3): " + hall.isBooked(3, 3));
        System.out.println("Seat (6, 7): " + hall.isBooked(6, 7));
    }


}
