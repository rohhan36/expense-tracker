const GraphBar = (props) => {
  let fillHeight = Math.round((props.value / props.maxVal) * 100) + "%";
  return (
    <div className="graph-bar">
      <div className="graph-area">
        <div className="graph-fill-area" style={{ height: fillHeight }}></div>
      </div>
      <div className="graph-lable">{props.lable}</div>
    </div>
  );
};

export default GraphBar;
