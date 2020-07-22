
import java.util.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> 
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class ThreeLinkBinTree<E>
{
	public static class TreeNode
	{
		Object data;
		TreeNode left;
		TreeNode right;
		TreeNode parent;
		public TreeNode()
		{
		}
		public TreeNode(Object data)
		{
			this.data = data;
		}
		public TreeNode(Object data , TreeNode left
			, TreeNode right , TreeNode parent)
		{
			this.data = data;
			this.left = left;
			this.right = right;
			this.parent = parent;
		}
		public String toString()
		{
			return data.toString();
		}
	}
	private TreeNode root;
	//以默认的构造器来创建二叉树
	public ThreeLinkBinTree()
	{
		this.root = new TreeNode();
	}
	//以指定根元素来创建二叉树
	public ThreeLinkBinTree(E data)
	{
		this.root = new TreeNode(data);
	}
	/**
	 * 为指定节点添加子节点。
	 * @param index 需要添加子节点的父节点的索引
	 * @param data 新子节点的数据
	 * @param isLeft 是否为左节点
	 * @return 新增的节点
	 */
	public TreeNode addNode(TreeNode parent , E data
		, boolean isLeft)
	{
		if (parent == null)
		{
			throw new RuntimeException(parent +
				"节点为null，无法添加子节点");
		}
		if (isLeft && parent.left != null)
		{
			throw new RuntimeException(parent +
				"节点已有左子节点，无法添加左子节点");
		}
		if (!isLeft && parent.right != null)
		{
			throw new RuntimeException(parent +
				"节点已有右子节点，无法添加右子节点");
		}
		TreeNode newNode = new TreeNode(data);
		if (isLeft)
		{
			//让父节点的left引用指向新节点
			parent.left = newNode;
		}
		else
		{
			//让父节点的left引用指向新节点
			parent.right = newNode;
		}
		//让新节点的parent引用到parent节点
		newNode.parent = parent;
		return newNode;
	}
	//判断二叉树是否为空。
	public boolean empty()
	{
		//根据根元素来判断二叉树是否为空
		return root.data == null;
	}
	//返回根节点。
	public TreeNode root()
	{
		if (empty())
		{
			throw new RuntimeException("树为空，无法访问根节点");
		}
		return root;
	}
	//返回指定节点（非根节点）的父节点。
	public E parent(TreeNode node)
	{
		if (node == null)
		{
			throw new RuntimeException(node +
				"节点为null，无法访问其父节点");
		}
		return (E)node.parent.data;
	}
	//返回指定节点（非叶子）的左子节点。当左子节点不存在时返回null
	public E leftChild(TreeNode parent)
	{
		if (parent == null)
		{
			throw new RuntimeException(parent +
				"节点为null，无法添加子节点");
		}
		return parent.left == null ? null : (E)parent.left.data;
	}
	//返回指定节点（非叶子）的右子节点。当右子节点不存在时返回null
	public E rightChild(TreeNode parent)
	{
		if (parent == null)
		{
			throw new RuntimeException(parent +
				"节点为null，无法添加子节点");
		}
		return parent.right == null ? null : (E)parent.right.data;
	}
	//返回该二叉树的深度。
	public int deep()
	{
		//获取该树的深度
		return deep(root); 
	}
	//这是一个递归方法：每棵子树的深度为其所有子树的最大深度 + 1
	private int deep(TreeNode node)
	{
		if (node == null)
		{
			return 0;
		}
		//没有子树
		if (node.left == null
			&& node.right == null)
		{
			return 1;
		}
		else
		{
			int leftDeep = deep(node.left);
			int rightDeep = deep(node.right);
			//记录其所有左、右子树中较大的深度
			int max = leftDeep > rightDeep ? 
				leftDeep : rightDeep;
			//返回其左右子树中较大的深度 + 1
			return max + 1;
		}
	}
	//实现先序遍历
	public List<TreeNode> preIterator()
	{
		return preIterator(root);
	}
	private List<TreeNode> preIterator(TreeNode node)
	{
		List<TreeNode> list = new ArrayList<TreeNode>();
		//处理根节点
		list.add(node);
		//递归处理左子树
		if (node.left != null)
		{
			list.addAll(preIterator(node.left));
		}
		//递归处理右子树
		if (node.right != null)
		{
			list.addAll(preIterator(node.right));
		}
		return list;
	}
	//实现中序遍历
	public List<TreeNode> inIterator()
	{
		return inIterator(root);
	}
	private List<TreeNode> inIterator(TreeNode node)
	{
		List<TreeNode> list = new ArrayList<TreeNode>();
		//递归处理左子树
		if (node.left != null)
		{
			list.addAll(inIterator(node.left));
		}
		//处理根节点
		list.add(node);
		//递归处理右子树
		if (node.right != null)
		{
			list.addAll(inIterator(node.right));
		}
		return list;
	}
	public List<TreeNode> postIterator()
	{
		return postIterator(root);
	}
	//实现后序遍历
	private List<TreeNode> postIterator(TreeNode node)
	{
		List<TreeNode> list = new ArrayList<TreeNode>();
		//递归处理左子树
		if (node.left != null)
		{
			list.addAll(postIterator(node.left));
		}
		//递归处理右子树
		if (node.right != null)
		{
			list.addAll(postIterator(node.right));
		}
		//处理根节点
		list.add(node);
		return list;
	}
	//广度优先遍历
	public List<TreeNode> breadthFirst()
	{
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		List<TreeNode> list = new ArrayList<TreeNode>();
		if( root != null)
		{
			//将根元素加入“队列”
			queue.offer(root);
		}
		while(!queue.isEmpty())
		{
			//将该队列的“队尾”的元素添加到List中
			list.add(queue.peek());
			TreeNode p = queue.poll();
			//如果左子节点不为null，将它加入“队列”
			if(p.left != null)
			{
				queue.offer(p.left);
			}
			//如果右子节点不为null，将它加入“队列”
			if(p.right != null)
			{
				queue.offer(p.right);
			}
		}
		return list;
	}
}
