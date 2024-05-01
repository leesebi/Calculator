import java.util.ArrayList;
import java.util.List;


public abstract class Calculator {

    private List<Double> results; // 생성자가 없을 경우 results = null

    public Calculator(List<Double> results) {
        this.results = results;
    }

    abstract void inquiryResults();

    // 가장 오래된 값을 지워야 하기때문에 인덱스 0
    public void removeResult(int index){
        this.results.remove(index);
    }

    public List<Double> getResults() {
        return results;
    }
}

