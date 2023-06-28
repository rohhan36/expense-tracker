import Graph from "./Graph";

const ExpenseGraph = (props) => {
  let expenseDataPoints = [
    { lable: "Jan", value: 0 },
    { lable: "Feb", value: 0 },
    { lable: "Mar", value: 0 },
    { lable: "Apr", value: 0 },
    { lable: "May", value: 0 },
    { lable: "Jun", value: 0 },
    { lable: "Jul", value: 0 },
    { lable: "Aug", value: 0 },
    { lable: "Sep", value: 0 },
    { lable: "Oct", value: 0 },
    { lable: "Nov", value: 0 },
    { lable: "Dec", value: 0 },
  ];

  for (let expense of props.expenses) {
    let expenseMonth = expense.date.getMonth();
    expenseDataPoints[expenseMonth].value += expense.price;
  }

  return <Graph dataPoints={expenseDataPoints} />;
};

export default ExpenseGraph;
