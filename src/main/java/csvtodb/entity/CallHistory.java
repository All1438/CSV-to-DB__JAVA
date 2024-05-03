package csvtodb.entity;

import javax.persistence.Entity;

@Entity
public class CallHistory {
    private String user;
    private String date;
    private String time;
    private String countryCode;
    private String directionCall;
    private String from;
    private String to;
    private String answered;
    private String missedCallReason;
    private String durationTotal;
    private String durationInCall;
    private String via;
    private String recordingUrl;
    private String callType;
    private String callStart;
    private String callEnd;
    private String callId;
    private String aircallNumber;
    private String customerNumber;
    private String inCallDuration;
    private String waitingTime;
    private String timeToAnswer;
    private String disconnectedBy;
}
