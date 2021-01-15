
public class Expression implements Comparable<Expression>
{

    String operator;
    double value1;
    double value2;
    double result;

    public Expression(String operator, double value1, double value2)
    {
        this.operator = operator.trim();
        this.value1 = value1;
        this.value2 = value2;

        switch (this.operator)
        {
            case "+":
                this.result = value1 + value2;
                break;
            case "-":
                this.result = value1 - value2;
                break;
            case "/":
                this.result = value1 / value2;
                break;
            case "*":
                this.result = value1 * value2;
                break;
            default:
                System.out.println("Unknown Operator!");
                this.result = 0;
                break;
        }
    }

    @Override
    public String toString()
    {
        return " " + operator + " ," + value1 + ", " + value2 + ", " + result + " ";
    }

    @Override
    public int compareTo(Expression e)
    {
        if (this.result > e.result)
        {
            return 1;
        }
        else if (this.result < e.result)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

    public boolean isSame(Expression e)
    {
        return this.operator.equals(e.operator) && this.result == e.result && this.value1 == e.value1 && this.value2 == e.value2;
    }

}
