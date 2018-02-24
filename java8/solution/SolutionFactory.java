package solution;

/**
 * Created by xinjian.ye on 2017/12/15.
 */
public class SolutionFactory {
    public static Solution createSolution(Class param) throws Exception {
        return (Solution) param.newInstance();
    }
}
