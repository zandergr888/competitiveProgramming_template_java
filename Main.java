
import java.lang.*;
import java.util.*;
import java.io.*;
import java.awt.*;
public class Main{
    static class times implements Comparable<times>{
        int a, b;
        public times(int _a, int _b){
            a = _a;
            b = _b;
        }
        public int compareTo(times a){
            return this.a - a.a;
        }
    }

    /*static Kattio io;
    static {
        try {
            io = new Kattio("cowqueue");
        } catch(IOException e) {}
    }*/
    static Kattio io = new Kattio();
    public static void main(String[]args) throws IOException {


    }


}

class Kattio extends PrintWriter {
    private BufferedReader r;
    private StringTokenizer st = new StringTokenizer("");
    private String token;

    // standard input
    public Kattio() { this(System.in,System.out); }
    public Kattio(InputStream i, OutputStream o) {
        super(o);
        r = new BufferedReader(new InputStreamReader(i));
    }
    // USACO-style file input
    public Kattio(String problemName) throws IOException {
        super(new FileWriter(problemName+".out"));
        r = new BufferedReader(new FileReader(problemName+".in"));
    }

    private String peek() {
        if (token == null)
            try {
                while (!st.hasMoreTokens()) {
                    String line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                token = st.nextToken();
            } catch (IOException e) { }
        return token;
    }
    public boolean hasMoreTokens() { return peek() != null; }
    public String next() {
        String ans = peek();
        token = null;
        return ans;
    }

    public int nextInt() { return Integer.parseInt(next()); }
    public double nextDouble() { return Double.parseDouble(next()); }
    public long nextLong() { return Long.parseLong(next()); }
}
