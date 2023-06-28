import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faCartShopping, faHeart, faHouseChimney, faMapLocation, faShapes, faShieldHeart, faSuitcase, faUtensils } from "@fortawesome/free-solid-svg-icons";
export default function ExpenseLogo(props) {
  const icons = new Map();
  icons.set("health", faSuitcase);
  icons.set("food", faUtensils);
  icons.set("shopping", faCartShopping);
  icons.set("entertainment", faHeart);
  icons.set("travel", faMapLocation);
  icons.set("home", faHouseChimney);
  icons.set("insurance", faShieldHeart);
  icons.set("other", faShapes);

  const category = props.data.category;
  const className = `expense-logo ${props.data.category}`;
  return (
    <div className={className}>
      <FontAwesomeIcon icon={icons.get(category)} style={{ color: "#ffffff" }} className="expense-icon" />
    </div>
  );
}
