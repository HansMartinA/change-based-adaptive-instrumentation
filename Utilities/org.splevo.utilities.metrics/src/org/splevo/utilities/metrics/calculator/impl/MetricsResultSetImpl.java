package org.splevo.utilities.metrics.calculator.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.splevo.utilities.metrics.calculator.MetricResultItem;
import org.splevo.utilities.metrics.calculator.MetricsResultSet;

/**
 * An implementation of a metrics result.
 * 
 * @author Benjamin Klatt
 * 
 */
public class MetricsResultSetImpl implements MetricsResultSet {

    /** The list of available metrics as keys. */
    private List<String> availableMetrics = new ArrayList<String>();

    /** The stored metrics. */
    private List<MetricResultItem> metrics = new ArrayList<MetricResultItem>();

    /** The map of calculated total metrics. */
    private Map<String, Object> totalMetrics = new HashMap<String, Object>();
    
    /** The id of the resultset. */
    private String id = null;

    /**
     * Add an available metric.
     * 
     * @param metricKey
     *            The key identifying this metric.
     */
    public void addAvailableMetric(String metricKey) {
        availableMetrics.add(metricKey);
    }

    /**
     * Add a metric item to the result.
     * 
     * @param item
     *            The result to add.
     */
    public void addMetric(MetricResultItem item) {
        metrics.add(item);
    }

    @Override
    public List<String> getAvailableMetrics() {
        return availableMetrics;
    }

    @Override
    public List<MetricResultItem> getMetrics() {
        return this.metrics;
    }

    @Override
    public Map<String, Object> getTotalMetrics() {
        return this.totalMetrics;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

}
