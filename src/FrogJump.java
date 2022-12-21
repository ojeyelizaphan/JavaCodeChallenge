public class FrogJump {
    public int solution(int X, int Y, int D){
        double distance = Y - X;
        int numberOfJumps = (int)Math.ceil(distance/D);

        return numberOfJumps;
    }

    public static void main(String[] args){
        FrogJump frogJump = new FrogJump();

        int answer = frogJump.solution(10,85,30);

        System.out.println(answer);
    }
}
