package org.csapi.policy;

/**
 *	Generated from IDL definition of exception "P_NAME_SPACE_ERROR"
 *	@author JacORB IDL compiler 
 */

public final class P_NAME_SPACE_ERRORHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.csapi.policy.P_NAME_SPACE_ERROR value;

	public P_NAME_SPACE_ERRORHolder ()
	{
	}
	public P_NAME_SPACE_ERRORHolder(final org.csapi.policy.P_NAME_SPACE_ERROR initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.csapi.policy.P_NAME_SPACE_ERRORHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.csapi.policy.P_NAME_SPACE_ERRORHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.csapi.policy.P_NAME_SPACE_ERRORHelper.write(_out, value);
	}
}
