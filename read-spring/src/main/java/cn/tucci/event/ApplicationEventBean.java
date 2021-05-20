package cn.tucci.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author tucci.lee
 */
public class ApplicationEventBean extends ApplicationEvent {


	private static final long serialVersionUID = 741716846867152595L;

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public ApplicationEventBean(Object source) {
		super(source);
	}
}
