package kryo.application.model;

import java.math.BigDecimal;

public class Statistics {
// ------------------------------ FIELDS ------------------------------

    private Integer last30DaysResponse;
    private BigDecimal averageResponseTime;
    private BigDecimal responseRate;

// --------------------- GETTER / SETTER METHODS ---------------------

    public BigDecimal getAverageResponseTime() {
        return averageResponseTime;
    }

    public void setAverageResponseTime(BigDecimal averageResponseTime) {
        this.averageResponseTime = averageResponseTime;
    }

    public Integer getLast30DaysResponse() {
        return last30DaysResponse;
    }

    public void setLast30DaysResponse(Integer last30DaysResponse) {
        this.last30DaysResponse = last30DaysResponse;
    }

    public BigDecimal getResponseRate() {
        return responseRate;
    }

    public void setResponseRate(BigDecimal responseRate) {
        this.responseRate = responseRate;
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Statistics)) return false;

        Statistics that = (Statistics) o;

        if (last30DaysResponse != null ? !last30DaysResponse.equals(that.last30DaysResponse) : that.last30DaysResponse != null)
            return false;
        if (averageResponseTime != null ? !averageResponseTime.equals(that.averageResponseTime) : that.averageResponseTime != null)
            return false;
        return responseRate != null ? responseRate.equals(that.responseRate) : that.responseRate == null;

    }

    @Override
    public final int hashCode() {
        int result = last30DaysResponse != null ? last30DaysResponse.hashCode() : 0;
        result = 31 * result + (averageResponseTime != null ? averageResponseTime.hashCode() : 0);
        result = 31 * result + (responseRate != null ? responseRate.hashCode() : 0);
        return result;
    }
}
