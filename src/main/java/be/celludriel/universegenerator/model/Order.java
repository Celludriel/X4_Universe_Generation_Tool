package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Order extends AbstractJson {

    private String order;
    private boolean defaultOrder = true;
    private List<OrderParameter> parameters = new ArrayList<>();

    public String getOrder() {
        return order;
    }

    public boolean isDefaultOrder() {
        return defaultOrder;
    }

    public List<OrderParameter> getParameters() {
        return parameters;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setDefaultOrder(boolean defaultOrder) {
        this.defaultOrder = defaultOrder;
    }

    public void setParameters(List<OrderParameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Order order1 = (Order) o;

        return new EqualsBuilder()
                .append(defaultOrder, order1.defaultOrder)
                .append(order, order1.order)
                .append(parameters, order1.parameters)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(order)
                .append(defaultOrder)
                .append(parameters)
                .toHashCode();
    }
}
