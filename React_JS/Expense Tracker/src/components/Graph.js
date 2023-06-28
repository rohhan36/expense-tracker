import GraphBar from "./GraphBar";
import Card from "./Card";

const Graph = (props) => {
  const datapointValues = props.dataPoints.map((dataPoint) => dataPoint.value);
  let max = Math.max(...datapointValues);

  let content;
  if (max > 0) {
    content = (
      <Card className="graph">
        {props.dataPoints.map((dataPoint) => (
          <GraphBar value={dataPoint.value} lable={dataPoint.lable} key={dataPoint.lable} maxVal={max} />
        ))}
      </Card>
    );
  }
  return content;
};

export default Graph;
