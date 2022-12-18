/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.transaction.annotation;

import org.springframework.transaction.TransactionDefinition;

/**
 * Enumeration that represents transaction propagation behaviors for use
 * with the {@link Transactional} annotation, corresponding to the
 * {@link TransactionDefinition} interface.
 * 事务隔离级别
 * @author Colin Sampaleanu
 * @author Juergen Hoeller
 * @since 1.2
 */
public enum Propagation {

	/**
	 * Support a current transaction, create a new one if none exists.
	 * Analogous to EJB transaction attribute of the same name.
	 * <p>This is the default setting of a transaction annotation.
	 *   如果当前存在事务就加入 不存在就新建一个事务
	 * 	 这样保证整个执行过程都是同一个事务只要一个方法回滚，整个事务均回滚。
	 */
	REQUIRED(TransactionDefinition.PROPAGATION_REQUIRED),

	/**
	 * Support a current transaction, execute non-transactionally if none exists.
	 * Analogous to EJB transaction attribute of the same name.
	 * <p>Note: For transaction managers with transaction synchronization,
	 * {@code SUPPORTS} is slightly different from no transaction at all,
	 * as it defines a transaction scope that synchronization will apply for.
	 * As a consequence, the same resources (JDBC Connection, Hibernate Session, etc)
	 * will be shared for the entire specified scope. Note that this depends on
	 * the actual synchronization configuration of the transaction manager.
	 * @see org.springframework.transaction.support.AbstractPlatformTransactionManager#setTransactionSynchronization
	 * 支持当前事务，如果当前没有事务，就以非事务方式执行。
	 */
	SUPPORTS(TransactionDefinition.PROPAGATION_SUPPORTS),

	/**
	 * Support a current transaction, throw an exception if none exists.
	 * Analogous to EJB transaction attribute of the same name.
	 * 支持当前事务，如果当前没有事务，就抛出异常。
	 */
	MANDATORY(TransactionDefinition.PROPAGATION_MANDATORY),

	/**
	 * Create a new transaction, and suspend the current transaction if one exists.
	 * Analogous to the EJB transaction attribute of the same name.
	 * <p><b>NOTE:</b> Actual transaction suspension will not work out-of-the-box
	 * on all transaction managers. This in particular applies to
	 * {@link org.springframework.transaction.jta.JtaTransactionManager},
	 * which requires the {@code jakarta.transaction.TransactionManager} to be
	 * made available to it (which is server-specific in standard Jakarta EE).
	 * @see org.springframework.transaction.jta.JtaTransactionManager#setTransactionManager
	 *
	 * 创建一个新的事务 如果当前存在事务 则把当前事务挂起
	 * 也就是说不管外部方法是否开启事务，Propagation.REQUIRES_NEW修饰的内部方法会新开启自己的事务，
	 * 且开启的事务相互独立，互不干扰。
	 * 比如 a 方法调用 b方法
	 * a设置的 REQUIRED
	 * b设置的 REQUIRES_NEW
	 *
	 * 如果 a发送异常进行事务回滚的话 并不影响 b的事务
	 * 但是 如果b事务进行回滚 并且没有捕获异常 被a方法捕获到了异常也会引起a事务的回滚
	 *
	 */
	REQUIRES_NEW(TransactionDefinition.PROPAGATION_REQUIRES_NEW),

	/**
	 * Execute non-transactionally, suspend the current transaction if one exists.
	 * Analogous to EJB transaction attribute of the same name.
	 * <p><b>NOTE:</b> Actual transaction suspension will not work out-of-the-box
	 * on all transaction managers. This in particular applies to
	 * {@link org.springframework.transaction.jta.JtaTransactionManager},
	 * which requires the {@code jakarta.transaction.TransactionManager} to be
	 * made available to it (which is server-specific in standard Jakarta EE).
	 * @see org.springframework.transaction.jta.JtaTransactionManager#setTransactionManager
	 *
	 * 以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。
	 */
	NOT_SUPPORTED(TransactionDefinition.PROPAGATION_NOT_SUPPORTED),

	/**
	 * Execute non-transactionally, throw an exception if a transaction exists.
	 * Analogous to EJB transaction attribute of the same name.
	 * 以非事务方式执行，如果当前存在事务，则抛出异常。
	 */
	NEVER(TransactionDefinition.PROPAGATION_NEVER),

	/**
	 * Execute within a nested transaction if a current transaction exists,
	 * behave like {@code REQUIRED} otherwise. There is no analogous feature in EJB.
	 * <p>Note: Actual creation of a nested transaction will only work on specific
	 * transaction managers. Out of the box, this only applies to the JDBC
	 * DataSourceTransactionManager. Some JTA providers might support nested
	 * transactions as well.
	 * @see org.springframework.jdbc.datasource.DataSourceTransactionManager
	 *
	 * 如果当前存在事务，则在嵌套事务内执行。如果当前没有事务，则进行与PROPAGATION_REQUIRED类似的操作。
	 */
	NESTED(TransactionDefinition.PROPAGATION_NESTED);


	private final int value;


	Propagation(int value) {
		this.value = value;
	}

	public int value() {
		return this.value;
	}

}
