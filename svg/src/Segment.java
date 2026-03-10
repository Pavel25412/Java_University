public class Segment {
    public Point a, b;

    public double length() {
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    @Override
    public String toString() {
        return "Segment{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public String toSvg() {
        return "<line x1=\""+ a.x + "\" y1=\"" + a.y + "\" " +
                "x2=\"" + b.x + "\" y2=\"" + b.y +"\" " +
                "style=\"stroke:red;stroke-width:4\" />";
    }

    public static Segment maxLength(Segment[] segments) {
        Segment result = null;

        for(Segment seg: segments) {
            if ( result == null || seg.length() > result.length()) result = seg;
        }
        return result;
    }
}
