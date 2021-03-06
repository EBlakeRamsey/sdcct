package gov.hhs.onc.sdcct.testcases.results.impl;

import gov.hhs.onc.sdcct.beans.impl.AbstractResultBean;
import gov.hhs.onc.sdcct.net.http.logging.HttpRequestEvent;
import gov.hhs.onc.sdcct.net.http.logging.HttpResponseEvent;
import gov.hhs.onc.sdcct.testcases.SdcctTestcase;
import gov.hhs.onc.sdcct.testcases.SdcctTestcaseDescription;
import gov.hhs.onc.sdcct.testcases.results.SdcctTestcaseResult;
import gov.hhs.onc.sdcct.testcases.submissions.SdcctTestcaseSubmission;
import gov.hhs.onc.sdcct.ws.logging.WsRequestEvent;
import gov.hhs.onc.sdcct.ws.logging.WsResponseEvent;
import javax.annotation.Nonnegative;
import javax.annotation.Nullable;

public abstract class AbstractSdcctTestcaseResult<T extends SdcctTestcaseDescription, U extends SdcctTestcase<T>, V extends SdcctTestcaseSubmission<T, U>>
    extends AbstractResultBean implements SdcctTestcaseResult<T, U, V> {
    protected V submission;
    protected String txId;
    protected HttpRequestEvent httpRequestEvent;
    protected HttpResponseEvent httpResponseEvent;
    protected long processedTimestamp;
    protected WsRequestEvent wsRequestEvent;
    protected WsResponseEvent wsResponseEvent;

    protected AbstractSdcctTestcaseResult(V submission) {
        this.txId = (this.submission = submission).getTxId();
    }

    @Nonnegative
    @Override
    public long getProcessedTimestamp() {
        return this.processedTimestamp;
    }

    @Override
    public void setProcessedTimestamp(@Nonnegative long processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
    }

    @Override
    public boolean hasHttpRequestEvent() {
        return this.httpRequestEvent != null;
    }

    @Nullable
    @Override
    public HttpRequestEvent getHttpRequestEvent() {
        return this.httpRequestEvent;
    }

    @Override
    public void setHttpRequestEvent(@Nullable HttpRequestEvent httpRequestEvent) {
        this.httpRequestEvent = httpRequestEvent;
    }

    @Override
    public boolean hasHttpResponseEvent() {
        return this.httpResponseEvent != null;
    }

    @Nullable
    @Override
    public HttpResponseEvent getHttpResponseEvent() {
        return httpResponseEvent;
    }

    @Override
    public void setHttpResponseEvent(@Nullable HttpResponseEvent httpResponseEvent) {
        this.httpResponseEvent = httpResponseEvent;
    }

    @Override
    public V getSubmission() {
        return this.submission;
    }

    @Override
    public String getTxId() {
        return this.txId;
    }

    @Override
    public void setTxId(String txId) {
        this.txId = txId;
    }

    @Override
    public boolean hasWsRequestEvent() {
        return this.wsRequestEvent != null;
    }

    @Nullable
    @Override
    public WsRequestEvent getWsRequestEvent() {
        return this.wsRequestEvent;
    }

    @Override
    public void setWsRequestEvent(@Nullable WsRequestEvent wsRequestEvent) {
        this.wsRequestEvent = wsRequestEvent;
    }

    @Override
    public boolean hasWsResponseEvent() {
        return this.wsResponseEvent != null;
    }

    @Nullable
    @Override
    public WsResponseEvent getWsResponseEvent() {
        return this.wsResponseEvent;
    }

    @Override
    public void setWsResponseEvent(@Nullable WsResponseEvent wsResponseEvent) {
        this.wsResponseEvent = wsResponseEvent;
    }
}
