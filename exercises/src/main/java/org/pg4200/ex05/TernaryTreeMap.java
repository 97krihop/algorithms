package org.pg4200.ex05;

import org.pg4200.les05.MyMapBinarySearchTree;
import org.pg4200.les05.MyMapTreeBased;

import java.util.Objects;

public class TernaryTreeMap<K extends Comparable <K>, V> implements MyMapTreeBased <K, V> {

	protected class TreeNode {
		public K firstKey;
		public K secondKey;

		public V firstValue;
		public V secondValue;

		public TreeNode left;
		public TreeNode middle;
		public TreeNode right;

		//left < first < middle < second < right
	}

	protected TreeNode root;

	protected int size;

	@Override
	public void put(K key, V value) {
		Objects.requireNonNull(key);
		root = put(key, value, root);
	}

	private TreeNode put(K key, V value, TreeNode subtree) {

		if(subtree == null){
			TreeNode node = new TreeNode();
			node.firstKey = key;
			node.firstValue = value;
			size++;
			return node;
		}
		int fc = key.compareTo(subtree.firstKey);

		if(fc < 0){
			subtree.left = put(key, value, subtree.left);
			return subtree;
		}else if(fc == 0){
			subtree.firstValue = value;
		}else if(fc > 0){

			if(subtree.secondKey == null){
				size++;
				subtree.secondKey = key;
				subtree.secondValue = value;
			}else{

			}
			int sc = key.compareTo(subtree.secondKey);
			if(sc < 0){
				subtree.middle = put(key, value, subtree.middle);
			}else if(sc == 0){
				subtree.secondValue = value;
			}else{
				subtree.right = put(key, value, subtree.right);
			}
		}
		return subtree;
	}

	@Override
	public V get(K key) {
		Objects.requireNonNull(key);
		return get(key, root);
	}

	private V get(K key, TreeNode subTree) {
		if(subTree == null){
			return null;
		}

		int fc = key.compareTo(subTree.firstKey);

		if(fc < 0){
			return get(key, subTree.left);
		}else if(fc == 0){
			return subTree.firstValue;
		}else{
			if(subTree.secondKey == null){
				return get(key, subTree.middle);
			}else{
				int sc = key.compareTo(subTree.secondKey);
				if(sc < 0){
					return get(key, subTree.middle);
				}else if(sc == 0){
					return subTree.secondValue;
				}else{
					return get(key, subTree.right);
				}
			}
		}
	}


	@Override
	public int getMaxTreeDepth() {
		return 0;
	}

	@Override
	public void delete(K key) {
		Objects.requireNonNull(key);

	}


	@Override
	public int size() {
		return 0;
	}


}
